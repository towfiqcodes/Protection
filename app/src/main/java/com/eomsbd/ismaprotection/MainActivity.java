package com.eomsbd.ismaprotection;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.eomsbd.ismaprotection.fragment.Sura1;
import com.eomsbd.ismaprotection.fragment.Sura10;
import com.eomsbd.ismaprotection.fragment.Sura11;
import com.eomsbd.ismaprotection.fragment.Sura12;
import com.eomsbd.ismaprotection.fragment.Sura13;
import com.eomsbd.ismaprotection.fragment.Sura14;
import com.eomsbd.ismaprotection.fragment.Sura15;
import com.eomsbd.ismaprotection.fragment.Sura16;
import com.eomsbd.ismaprotection.fragment.Sura17;
import com.eomsbd.ismaprotection.fragment.Sura18;
import com.eomsbd.ismaprotection.fragment.Sura2;
import com.eomsbd.ismaprotection.fragment.Sura3;
import com.eomsbd.ismaprotection.fragment.Sura4;
import com.eomsbd.ismaprotection.fragment.Sura5;
import com.eomsbd.ismaprotection.fragment.Sura6;
import com.eomsbd.ismaprotection.fragment.Sura7;
import com.eomsbd.ismaprotection.fragment.Sura8;
import com.eomsbd.ismaprotection.fragment.Sura9;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ConstraintLayout constraintLayout;
    LinearLayout button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_item);
        button = findViewById(R.id.startBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        constraintLayout = findViewById(R.id.container);
        String[] item = getResources().getStringArray(R.array.praise);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                if (position == 0) {

                    Sura1 fragment = new Sura1();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 1) {
                    Sura2 fragment = new Sura2();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 2) {
                    Sura3 fragment = new Sura3();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 3) {
                    Sura4 fragment = new Sura4();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 4) {

                    Sura5 fragment = new Sura5();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 5) {
                    Sura6 fragment = new Sura6();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 6) {
                    Sura7 fragment = new Sura7();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 7) {
                    Sura8 fragment = new Sura8();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 8) {
                    Sura9 fragment = new Sura9();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 9) {
                    Sura10 fragment = new Sura10();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 10) {
                    Sura11 fragment = new Sura11();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 11) {
                    Sura12 fragment = new Sura12();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 12) {
                    Sura13 fragment = new Sura13();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 13) {
                    Sura14 fragment = new Sura14();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 14) {
                    Sura15 fragment = new Sura15();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 15) {
                    Sura16 fragment = new Sura16();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 16) {
                    Sura17 fragment = new Sura17();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                } else if (position == 17) {
                    Sura18 fragment = new Sura18();
                    transaction.replace(R.id.frame, fragment).commit();
                    constraintLayout.setVisibility(View.GONE);
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        tellFragments();
        super.onBackPressed();
    }
    private void tellFragments() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment f : fragments) {
            if (f != null && f instanceof Sura1) {
                ((Sura1) f).onBackPressed();
            } else if (f != null && f instanceof Sura2) {
                ((Sura2) f).onBackPressed();
            }else if (f != null && f instanceof Sura3) {
                ((Sura3) f).onBackPressed();
            } else if (f != null && f instanceof Sura4) {
                ((Sura4) f).onBackPressed();
            } else if (f != null && f instanceof Sura5) {
                ((Sura5) f).onBackPressed();
            } else if (f != null && f instanceof Sura6) {
                ((Sura6) f).onBackPressed();
            } else if (f != null && f instanceof Sura7) {
                ((Sura7) f).onBackPressed();
            } else if (f != null && f instanceof Sura8) {
                ((Sura8) f).onBackPressed();
            } else if (f != null && f instanceof Sura9) {
                ((Sura9) f).onBackPressed();
            } else if (f != null && f instanceof Sura10) {
                ((Sura10) f).onBackPressed();
            }else if (f != null && f instanceof Sura11) {
                ((Sura11) f).onBackPressed();
            }else if (f != null && f instanceof Sura12) {
                ((Sura12) f).onBackPressed();
            }else if (f != null && f instanceof Sura13) {
                ((Sura13) f).onBackPressed();
            }else if (f != null && f instanceof Sura14) {
                ((Sura14) f).onBackPressed();
            }else if (f != null && f instanceof Sura15) {
                ((Sura15) f).onBackPressed();
            }else if (f != null && f instanceof Sura16) {
                ((Sura16) f).onBackPressed();
            }else if (f != null && f instanceof Sura17) {
                ((Sura17) f).onBackPressed();
            }else if (f != null && f instanceof Sura18) {
                ((Sura18) f).onBackPressed();
            }
        }
    }
}
