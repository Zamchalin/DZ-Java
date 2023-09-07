package Homework.Homework_1;
import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
                Integer n = 1000;
                List<Integer> primes = new ArrayList<>();
        
                for (int i = 2; i <= n; i++) {
                    boolean isPrimeNumber = true;
        
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrimeNumber = false;
                            break;
                        }
                    }
        
                    if (isPrimeNumber) {
                        primes.add(i);
                    }
                }
                System.out.println("Простые числа: " + primes);
            }
        }
    

