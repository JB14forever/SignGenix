package com.example.signgenix.subtitle.utils;

import java.io.IOException;
import java.io.InputStream;

public interface TimedTextFileFormat {

    TimedTextObject parseFile(String fileName, InputStream is) throws IOException, FatalParsingException;

    Object toFile(TimedTextObject tto);


}