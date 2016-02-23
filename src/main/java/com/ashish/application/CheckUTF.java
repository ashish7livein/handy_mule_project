package com.ashish.application;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CheckUTF {

    public static void main (String args[]) throws UnsupportedEncodingException {
        String[] strings = {"MARIE-HÉLÈNE","Jenée LaMarque","itâ€™s","‘em","JenÃ©e LaMarque","Jen�e LaMarque"};
        for (String string : strings) {
            System.out.println(string+"\t"+isUTF8MisInterpreted(string, "Windows-1252"));
            System.out.println(string+"  :\t:  "+new String(string.getBytes("ISO-8859-1")));
        }
    }
    
    public static boolean isUTF8MisInterpreted( String input, String encoding) {

        CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
        CharsetEncoder encoder = Charset.forName(encoding).newEncoder();
        ByteBuffer tmp;
        try {
            tmp = encoder.encode(CharBuffer.wrap(input));
        }

        catch(CharacterCodingException e) {
            return false;
        }

        try {
            decoder.decode(tmp);
            return true;
        }
        catch(CharacterCodingException e){
            return false;
        }       
    }
    
}
