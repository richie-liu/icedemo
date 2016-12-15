/**
 * Created by richie on 16/12/12.
 */

import Demo.*;
import com.sun.tools.internal.xjc.model.CBuiltinLeafInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Client extends Ice.Application {
    private static void menu() {
        System.out.println("usage:\n" +
                "t:send greeting\n" +
                "1:getplllar\n" +
                "2:getrandom\n" +
                "x:exit");
    }

    @Override
    public int run(String[] strings) {


        CurvePrx twoway = CurvePrxHelper.checkedCast(
                communicator().propertyToProxy("Curve.Proxy").ice_twoway().ice_secure(false));
        menu();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        do{
            try{
                System.out.print("==> ");
                System.out.flush();
                line=in.readLine();
                if(line.equals("t")){
                    twoway.sayCurve(0);
                }else if(line.equals("1")){
                    String[] pilars = twoway.getPillars();
                    System.out.println(Arrays.toString( pilars));
                }else if(line.equals("2")){
                    float disocunt = twoway.getDiscount(123);
                    System.out.println(disocunt);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!line.equals("x"));
        return 0;


    }

    public static void main(String[] args) {

        Client app=new Client();
        int status=app.main("Client",args,"config.client");
        System.exit(status);
    }
}
