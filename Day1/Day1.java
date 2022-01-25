package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Day1/day1.txt"));
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNext()) {
            arr.add(sc.nextInt());
        }
        part1(arr);
        part2(arr);
    }

    private static void part1(List<Integer> input) {
        System.out.printf("Part 1 Solution: %d\n", input.stream().mapToInt(a -> a.intValue()/3 - 2).sum());
    }

    private static void part2(List<Integer> input) {
        System.out.printf("Part 2 Solution: %d\n", input.stream().mapToInt(a -> fuelRequirement(a)).sum());
    }

    private static int fuelRequirement(int a) {
        if (a < 3) {return 0;}
        int fuel = Math.max(a/3 - 2, 0);
        return fuel + fuelRequirement(fuel);
    }
}