package DesignPatterns.Adapter;

import DesignPatterns.Adapter.HDFCBankAdapter.HDFCBankAdapter;

public class App {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new HDFCBankAdapter());

        System.out.println("Account Balance :" + phonePe.getBalance("1233455"));

    }
}
