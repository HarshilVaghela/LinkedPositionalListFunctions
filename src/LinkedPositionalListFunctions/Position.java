/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedPositionalListFunctions;

/**
 *From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 * @date October 21,2020(Lab4)
 */
public interface Position<E> {
  /**
   * Returns the element stored at this position.
   *
   * @return the stored element
   * @throws IllegalStateException if position no longer valid
   */
  E getElement() throws IllegalStateException;
}
