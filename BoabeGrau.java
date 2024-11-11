import java.math.BigInteger;

public class BoabeGrau {

    public static void main(String[] args) {
        BigInteger totalBoabe = BigInteger.ZERO;
        BigInteger boabePeCasuta = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            totalBoabe = totalBoabe.add(boabePeCasuta);
            boabePeCasuta = boabePeCasuta.multiply(BigInteger.valueOf(2));
        }

        System.out.println("Total boabe de grau pe tabla de sah: " + totalBoabe);
    }
}
