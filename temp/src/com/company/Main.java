package com.company;

import java.awt.image.BufferedImage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the message, that you want to encode into image");
        String encodeMessage = scanner.nextLine();

        System.out.println("Write image path (Example : C:\\Users\\User\\Pictures )");
        String path = scanner.nextLine();

        System.out.println("Write image name");
        String name = scanner.nextLine();

        System.out.println("Write image extension");
        String extension = scanner.nextLine();

        System.out.println("Write decoded image name");
        String decodedName = scanner.nextLine();

        String decodedMessage;

            Steganography steganography = new Steganography();

            steganography.encode(path,name,extension,decodedName,encodeMessage);

            decodedMessage = steganography.decode(path, decodedName);
            System.out.println(decodedMessage);



    }
}
