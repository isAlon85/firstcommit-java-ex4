package com.company;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;
import com.sparkpost.transport.IRestConnection;

/**
 * My First Email Example
 *
 */
public class Main
{
    public static void main(String[] args) throws SparkPostException {
        String API_KEY = "c3df3cd523fdd690bf045ed975dfffcf18f5159e";
        Client client = new Client(API_KEY, IRestConnection.SPC_EU_ENDPOINT);
        client.sendMessage(
                "first.commit@control.obalonso.es",
                "ianstry85@gmail.com",
                "Welcome email from OB First Commit",
                "This is a welcome email from Java OB_FC Exercise 4",
                "<p>This is a welcome email from Java OB_FC Exercise 4</p>");
    }
}
