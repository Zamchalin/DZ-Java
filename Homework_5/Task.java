package Homework_5;
// Реализуйте структуру телефонной книги с помощью Map, учитывая, что 1 человек может иметь несколько телефонов и у 
// человека уникальное имя. Поработать с методами Map.
// Отсортировать Map в обратном порядке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Task{
    static Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        
        //  Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        // addNumber("Иванов", "+79648725454", phoneBook);
        // addNumber("Петров", "+79648775454", phoneBook);
        // addNumber("Иванов","+79648711554", phoneBook);
        // addNumber("Сидоров", "+7964873333", phoneBook);
        // addNumber("Иванов", "+796432415454", phoneBook);
        // addNumber("Петров", "+7962335454", phoneBook);
        // printBook(phoneBook);
        // revertBook(phoneBook);
        addNumber();
        System.out.println(phoneBook);
        showContacts();
        
        
        

    }
public static void addNumber(){
    
    phoneBook.put("Иванов", new ArrayList<>());
    phoneBook.get("Иванов").add("+111111111");
    phoneBook.put("Петров", new ArrayList<>());
    phoneBook.get("Петров").add("+722222222");
    phoneBook.put("Иванов", new ArrayList<>());
    phoneBook.get("Иванов").add("+33333333");
    phoneBook.put("Сидоров", new ArrayList<>());
    phoneBook.get("Сидоров").add("+444444444");
    phoneBook.get("Иванов").add("+5555555555");
    phoneBook.get("Петров").add("+666666666");
    phoneBook.get("Иванов").add("+7777777777");
}


public static void showContacts() {
        if(phoneBook.size() == 0) {
            System.out.println("Your phonebook is empty. Add new phoneBook to use it :)");
        } else {
            phoneBook = phoneBook.entrySet()      
                .stream()              
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (oldValue, newValue) -> oldValue,
                                    LinkedHashMap::new
                                ));
            System.out.println(phoneBook);
        }
    }
}
