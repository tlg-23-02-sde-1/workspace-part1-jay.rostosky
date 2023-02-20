package org.chat;

class ChatClient {

    public static void main(String[] args) {
        Chat chat1 = new Chat();

        chat1.add("jrostosk", "Hi everybody, let's chat");
        chat1.add("josh", "More snow shoveling today, ugh");
        chat1.add("jrostosk", "Bummer dude");
        chat1.add("chance", "What's snow?  :)");
        chat1.add("josh", "Seriously?");

        System.out.println(chat1.getContent());
    }
}