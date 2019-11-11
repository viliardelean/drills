/**
 *  Copyright Murex S.A.S., 2003-2019. All Rights Reserved.
 *
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.ardelean.drills;

import java.util.ArrayList;
import java.util.List;


public class ListDrills {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods
    //~ ----------------------------------------------------------------------------------------------------------------

    // return a List with the elements which start with a certain letter from the original List
    public List<String> elementsStartingWith(List<String> input, String letter) {
        List<String> output = new ArrayList<String>();
        for (String element : input) {
            if (element.startsWith(letter)) {
                output.add(element);
            }
        }
        return output;
    }
}
