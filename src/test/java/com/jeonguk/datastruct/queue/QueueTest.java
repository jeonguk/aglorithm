package com.jeonguk.datastruct.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void givenQueue_thenUsing_thenResultTest() {
        Queue<Integer> queue = new Queue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        assertEquals(new Integer("1"), queue.peek()); // Queue에 맨 앞에 있는 데이터 참조
        assertEquals(new Integer("1"), queue.poll()); // Queue에 있는 가장먼저 보관한 데이터 꺼내고 반환.
        assertEquals(new Integer("2"), queue.poll());
        assertEquals(new Integer("3"), queue.poll());
        assertEquals(Boolean.FALSE, queue.isEmpty());
        assertEquals(new Integer("4"), queue.poll());
        assertEquals(new Integer("5"), queue.poll());
        assertEquals(Boolean.TRUE, queue.isEmpty());
    }

}