package org.example;

import java.util.Stack;

public class MyStringBuilder {
    private StringBuilder sb;
    private Stack<StringBuilder> history;

    public MyStringBuilder() {
        sb = new StringBuilder();
        history = new Stack<>();
    }

    public MyStringBuilder(String str) {
        sb = new StringBuilder(str);
        history = new Stack<>();
        makeSnapshot();
    }

    public MyStringBuilder append(String str) {
        makeSnapshot();
        sb.append(str);
        return this;
    }

    public MyStringBuilder reverse() {
        makeSnapshot();
        sb.reverse();
        return this;
    }

    public MyStringBuilder undo() {
        if (!history.isEmpty()) {
            sb = history.pop();
        }
        return this;
    }

    public String toString() {
        return sb.toString();
    }

    private void makeSnapshot() {
        history.push(new StringBuilder(sb));
    }
}
