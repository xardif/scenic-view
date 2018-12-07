package org.scenicview;

import javafx.application.Application;

/**
 * @author created: xardif on 07.12.2018 13:29
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class Main
{

    public static void main( String[] args )
    {
        if( args.length > 0 )
        {
            for( int i = 0; i < args.length; ++i )
            {
                if( args[ i ].equals( "-debug" ) )
                {
                    ScenicView.debug = true;
                }
            }
        }

        Application.launch( ScenicView.class, args );
    }

}
