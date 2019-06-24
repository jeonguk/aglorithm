package com.jeonguk.datastruct;

import java.util.NoSuchElementException;

/**
 peek() : Queue에 가장먼저 보관한 데이터 참조. (Queue에서 꺼내진 않음)
 poll() : Queue에 있는 가장먼저 보관한 데이터 꺼내고 반환.
 offer() : Queue에 데이터를 삽입, 순차보관
 isEmpty() : Queue가 비어있는지 확인
 */
public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    public void offer(T data) {
        Node<T> node = new Node<>(data);
        if (last != null) {
            last.next = node;
        }
        last = node;
        if (first == null) {
            first = last;
        }
    }

    public T poll() {
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        return data;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    class Node<T> {
        private T data;
        private Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

}
