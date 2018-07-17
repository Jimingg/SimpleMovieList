package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//1b:create a Listview variable
 ListView lvMovie;
//2a:create an ArrayList variable
 ArrayList<String> alMovieList;
 //3a:Create an ArrayAdapter;
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1c:Bind the Ui element to the java variable
        lvMovie=findViewById(R.id.listViewMovie);
        //2b:initialize the ArrayList
        alMovieList=new ArrayList<>();
        //2c:Add data into the Arraylist
        alMovieList.add("Avengers Infinity war Release Date :2018.04");
        alMovieList.add("Justice League Release Date::2017.11");
        //3b:Initialize the arrayadpater and bind it to the ArrayList
        aaMovie=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alMovieList);
        //4:Bind the listview to the ArrayAdapter
        lvMovie.setAdapter(aaMovie);
    }
}
