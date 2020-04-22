package com.example.admin.coffeebuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(//Drinks is java class here
                this,
                android.R.layout.simple_list_item_1,//appears itself
                Drinks.drinks//to display each item in list form
        );
        listDrinks.setAdapter(listAdapter);//here similarly gave object of event handler while setting it on list

    }

      public void onListItemClick(ListView listView,View itemView,int position, long id){
          Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        startActivity(intent);
      }

}
