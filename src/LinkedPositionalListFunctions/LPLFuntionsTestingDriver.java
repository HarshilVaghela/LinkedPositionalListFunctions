/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedPositionalListFunctions;

/**
 *
 * @author Harshilkumar Vaghela(3116318)
 * @date October 21,2020(Lab4)
 */
public class  LPLFuntionsTestingDriver{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PositionalList<Integer> ints=new LinkedPositionalList<>();
        for(int i=10;i>0;i--){
        ints.addFirst(i);
        }
        Position<Integer> cursor=ints.first();
        System.out.println("Cursor elements: "+cursor+"\n LPL elements: "+ints);
        for(int j=1;j<5;j++){
        cursor=ints.after(cursor);
        }
        System.out.println("\nCursor elements: "+cursor+"\n LPL elements: "+ints);
        ints.addBefore(cursor,8);ints.addAfter(cursor, 2);
        System.out.println("\nCursor elements: "+cursor+"\n LPL elements: "+ints);
        for(int j=1;j<3;j++){
        cursor=ints.before(cursor);
        }
        System.out.println("\nCursor elements: "+cursor+"\n LPL elements: "+ints);
        ints.set(ints.after(cursor),10);ints.remove(ints.before(cursor));
        System.out.println("\nCursor elements: "+cursor+"\n LPL elements: "+ints);
        
         cursor=ints.first();
        while(cursor!=ints.last()){cursor=ints.after(cursor);
            if(ints.before(cursor).getElement()>7){
                ints.remove(ints.before(cursor));
            }
        }
        if(cursor.getElement()>7){
            ints.remove(cursor);
        }
         System.out.println("\n LPL elements: "+ints);
         System.out.println(ints.last());
        
    }
    
}
