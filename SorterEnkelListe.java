import java.util.Iterator;

public class SorterEnkelListe<E extends Comparable<E>> implements AbstraktSortertEnkelListe<E>, Iterable<E>, Lik {
    private Node forste;

    public Iterator<E> iterator()
    {return new ListeIterator();}

   public void settInnSortert(E e){
        if (forste==null){
            forste=new Node(e);
        }
        else if (forste.neste==null&&forste.data.compareTo(e)<0){
        Node temp = forste;
        forste = new Node(e);
        forste.neste=temp;
        }
        else {Node tmp=forste;
            while (tmp.neste !=null){
                if (tmp.data.compareTo(e)<0){
                    Node storre=tmp;
                    tmp = new Node (e);
                    tmp.neste=storre;
                }
                else if (tmp.neste==null){
                    tmp.neste= new Node(e);
                }
                tmp=tmp.neste;
            }
        }
    }



    public E sookEtterNookel(String a) {
        Node temp = forste;
        while (temp.neste!=null){
        if (forste.neste==null){
            if (a.equalsIgnoreCase(forste.data.toString())){
                return forste.data;
            }
        }

        else{
            if (a.equalsIgnoreCase(temp.data.toString())){return temp.data;}
            temp=temp.neste;
        }}
        return null;
    }


    public boolean samme(String a) {
        return false;
    }


    private class Node{
        E data;
        Node neste;
        public Node (E data){this.data=data;}


    }

    class ListeIterator implements Iterator<E>{
        Node tmp = forste;
        @Override
        public boolean hasNext() {
            return tmp!=null;
        }


        public E next() {
            E denne = tmp.data;
            tmp = tmp.neste;
            return denne;
        }

        public void remove() {

        }
    }}


