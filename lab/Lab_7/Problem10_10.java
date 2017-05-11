/* file: Problem10_17.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: May 5, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */


public class Problem10_10 {
    public static void main(String[] args) {

        
        Queue queue = new Queue(8);

       
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

   
        while (queue.getSize() > 0) {
            System.out.println(queue.dequeue());
        }
    }

   static class Queue {
        int[] elements;
        int size;

       

        Queue(int initialCap) {
            elements = new int[initialCap];
        }

        void enqueue(int k) {
            if (size >= elements.length) {
                int[] temp = new int[elements.length * 2];
                System.arraycopy(elements, 0, temp, 0, elements.length);
                elements = temp;
            }
            elements[size++] = k;
        }

        int dequeue() {
            int element = elements[0];
            size--;
            System.arraycopy(elements, 1, elements, 0, size);
            return element;
        }

        boolean empty() {
            return size == 0;
        }

        int getSize() {
            return size;
        }
    }
}