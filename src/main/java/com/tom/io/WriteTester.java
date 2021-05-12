package com.tom.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
            File jkDir= new File("/Users/henrycai/jk");
            jkDir.mkdir();
            FileWriter fw = new FileWriter("/Users/henrycai/jk/output.txt");
            fw.write("abc");
            fw.flush();//輸出一定要加flush從電腦記憶體緩衝區寫出到目的地的方法
            fw.close();

    }
}
