package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Third {
    private final char[] vowels = {
            'а', 'у', 'о',
            'ы', 'э', 'е',
            'ё', 'и', 'ю',
            'я', 'А', 'У',
            'О', 'Ы', 'Э',
            'Е', 'Ё', 'И',
            'Ю', 'Я' };

    public void getVowelCount(String sentence) {
        int count = 0;
        char[] sentenceChars = sentence.toCharArray();

        for (int i = 0; i < sentence.length(); ++i) {
            for (int j = 0; j < vowels.length; ++j) {
                if (sentenceChars[i] == vowels[j]) {
                    count++;
                }
            }
        }

        System.out.println("Кол-во гласных в словах: " + count);
    }

    public void getWords(String sentence) {
        String[] words = sentence.split(" ");
        Map<Integer, ArrayList<String>> list = new HashMap<>();
        int count = 0;

        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < vowels.length; ++j) {
                char[] temp = words[i].toCharArray();
                for (int k = 0; k < temp.length; ++k) {
                    if (temp[k] == vowels[j]) {
                        count++;
                    }
                }
            }

            if (list.containsKey(count)) {
                list.get(count).add(words[i]);
            } else {
                ArrayList<String> al = new ArrayList<>();
                al.add(words[i]);
                list.put(count, al);
            }
            count = 0;
        }

        System.out.print("Отсортированные слова: ");
        for(Integer key : list.keySet()) {
            System.out.print(list.get(key));
        }

    }

    public void firstUpperCase(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; ++i) {
            char[] temp = words[i].toCharArray();
            for (int j = 0; j < temp.length; ++j) {
                for (int k = 0; k < vowels.length; ++k) {
                    if (temp[j] == vowels[k]) {
                        words[i] = words[i].substring(0, j) + words[i].substring(j, j+1).toUpperCase() + words[i].substring(j+1);
                        j = temp.length;
                        break;
                    }
                }

            }
        }

        System.out.print("\nПервая гласная - заглавная: ");
        for (int i = 0; i < words.length; ++i) {
            if (i == words.length - 1) {
                System.out.print(words[i]);
            } else {
                System.out.print(words[i] + ", ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        Third obj = new Third();
        obj.getVowelCount(sentence);
        obj.getWords(sentence);
        obj.firstUpperCase(sentence);
    }
}
