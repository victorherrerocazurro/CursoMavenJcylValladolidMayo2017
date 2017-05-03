#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

/**
 * Hello world!
 *
 */
public class App 
{
    public static String CONST = "${symbol_dollar}";
    public static String OTRA = "${otraVariable}";
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World! ${symbol_pound}" );
    }
}
