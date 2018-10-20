package ht.eilmot.address;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class CustumUserAdapter extends ArrayAdapter<String>{
        public CustumUserAdapter(Context context, ArrayList<User> users){
            super(context, 0, users);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if(convertView==null){
                convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            }
            User user=getItem(position);
            TextView tvName=(TextView) convertView.findViewById(R.id.tvName);
            TextView tvHome=(TextView) convertView.findViewById(R.id.tvHome);
            tvName.setText(user.getName());
            tvHome.setText(user.getHometown());
            return convertView;
        }
    }
}
