package org.chat;

class Chat {
    private StringBuilder content = new StringBuilder();

    public void add(String user, String chatText) {
        content.append(String.format("%s: %s\n", user, chatText));
    }

    public String getContent() {
        return content.toString();
    }
}