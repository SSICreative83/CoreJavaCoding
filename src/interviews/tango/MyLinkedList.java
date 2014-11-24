/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Tango;

/**
 *
 * @author huijun
 */
import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E>
{   
    private Node<E> head;

    public MyLinkedList ()
    {
        head = null;
    }

    public void add (Node<E> n)
    {
        if (head == null)
        {
            head = n;
        }

        else
        {
            Node<E> node = head;
            while (node.next != null) 
            {
                node = node.next;
            }
            node.next = n;
        }
    }

    @Override
    public Iterator iterator() 
    {
        return new MyLinkedListIterator (head);
    }

    public int size () 
    {
        int ret = 0;
        MyLinkedListIterator it = new MyLinkedListIterator (head);
        while (it.hasNext ())
        {
            it.next();
            ret++;
        }

        return ret;
    }

    public Node<E> getHead ()
    {
        return head;
    }
}

class MyLinkedListIterator<E> implements Iterator<E>
{
    private E node;

    public MyLinkedListIterator (E h)
    {
        node = h;
    }

    public boolean hasNext () 
    {
         return node != null;   //not correct
    }

    public E next () 
    {
        return node;            //not correct
    }

    public void remove () 
    {

    }   
}

class Node<E> {
    E data;
    Node<E> next;    
}