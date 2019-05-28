package com.example.dynamiclayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mLayout;
    private TextView mTextView;
    static final int MY_TEXT_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // déclaration du layout du Viewgroup
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        // déclaration du layout
        mLayout = new RelativeLayout(this);
        // application du layout
        mLayout.setLayoutParams(lp);

        // layout du Textview
        RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        // déclaration du TextView
        mTextView = new TextView(this);

        // spécification de propriétés du TextView
        mTextView.setId(MY_TEXT_ID);
        mTextView.setText("Bonjour EB03 !");
        mTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);

        // ajout de propriétés de Layout
        lp1.addRule(RelativeLayout.CENTER_IN_PARENT,RelativeLayout.TRUE);

        // application du Layout
        mTextView.setLayoutParams(lp1);

        // affichage de la racine
        setContentView(mLayout);

        // visualisation du TextView;
        mLayout.addView(mTextView);


    }
}
