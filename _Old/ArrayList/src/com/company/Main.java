package com.company;
import java.util.Random;


class ArrayListTest{


    public ArrayListTest(){
        numberElements = 0;
        listElements = new int[0];
    }

    public ArrayListTest(int sizeList){
        numberElements = 0;
        listElements = new int[sizeList];
    }


    public void addArrayListTest(int insertionElement) {
        int sizeList = listElements.length;
        int sizeListNew;
        if (numberElements < sizeList) {                   //Если количество вставленных элементов меньше чем размер массива
            listElements[numberElements] = insertionElement;
            numberElements++;
        } else {
            sizeListNew = sizeList * 3 / 2 + 1;           // Если больше создаем новый массив и переписываем данные туда.
            int[] listElementsNew = new int[sizeListNew];
            for (int i = 0; i < sizeList; i++) {
                listElementsNew[i] = listElements[i];
            }
            listElementsNew[numberElements] = insertionElement;
            this.numberElements++;
            this.listElements = listElementsNew;
        }
    }



    public int getArrayListTest(int i) {
            return listElements[i];
    }

    public int size () {
        return numberElements;
    }

    public int searchArrayListTest (int elementSearch) {
        for (int i=0; i < numberElements; i++){
            if(listElements[i]==elementSearch) {
                return i;                         //если нашел возвращаем индекс элемента
            }
        }
        return -1;                                 //если не нашел
    }

    public boolean searchBooleanArrayListTest (int elementSearch) {
        if (searchArrayListTest(elementSearch)>0) {
            return true;
        }
        else return false;
    }


    private int numberElements;  //показывает  количество элементов , что мы добавили.
    private int listElements[];


}

public class Main {



    public static void main(String[] args) {

        int sizeList = 5;
        ArrayListTest listTest = new ArrayListTest();
        Random random = new Random();
        for (int i=0; i <= 50; i++){
            listTest.addArrayListTest(i);
        }

        for (int i=0; i < listTest.size(); i++){
            System.out.println("Элемент номер: " + i + "  равен: " + listTest.getArrayListTest(i) );
        }

        System.out.println(listTest.searchArrayListTest (100));
        System.out.println(listTest.searchBooleanArrayListTest (5));


    }
}
