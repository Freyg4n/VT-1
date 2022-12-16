
package by.bsuir.firstlab.twelfplus;


public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Book book = new Book();
        
        ProgrammerBook pr= new ProgrammerBook();
        
        PriceComparator price=new PriceComparator();
        TitleComparator tit=new TitleComparator();
        tit.thenComparing(price);
        AuthorComparator aut=new AuthorComparator();
        aut.thenComparing(tit);
        
        System.out.print(pr.toString());
    }
}
