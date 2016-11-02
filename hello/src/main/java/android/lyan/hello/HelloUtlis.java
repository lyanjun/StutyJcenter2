package android.lyan.hello;

import android.content.Context;
import android.widget.Toast;

/**
 * Author LYJ
 * Created on 2016/11/2.
 * Time 09:02
 */

public class HelloUtlis {

    public static void toastHello(Context context){
        Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show();
    }
}
