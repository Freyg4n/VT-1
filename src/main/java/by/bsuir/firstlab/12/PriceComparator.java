
package by.bsuir.firstlab.twelfplus;

import java.util.Comparator;


public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {        
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
