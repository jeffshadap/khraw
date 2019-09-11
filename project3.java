package com.khraw;

public class project3 {
    public static void main(String args[]) {
        String stream = determinedStream(9, 9, 9);
        System.out.println(stream);
    }

    public static String determinedStream(int science, int maths, int english) {
        String stream = "not found";
        if (science >= 80 && maths >= 80 && english >= 80)
            stream = "pure science";
        if (science >=80 && maths >= 80 && english >= 60)
            stream = "bio science";
        if (science >=60 && maths >= 60 && english >= 60)
            stream = "commerce";
        return stream;
    }
}

