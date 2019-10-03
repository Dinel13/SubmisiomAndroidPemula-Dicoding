package com.omrobbie.androidversions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAndroid;
    private List<AndroidPojo> list;
    private RecyclerView.ItemDecoration decoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();
        setupList();

        loadDataDummy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, AboutActivity.class));
        }

        return true;
    }

    private void setupEnv() {
        rvAndroid = (RecyclerView) findViewById(R.id.rvAndroid);

        list = new ArrayList<>();
        decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
    }

    private void setupList() {
        AndroidAdapter adapter = new AndroidAdapter(list);
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        rvAndroid.addItemDecoration(decoration);
        rvAndroid.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new AndroidPojo(
                R.drawable.cee,
                "C",
                "Dennish Ritche",
                "1972",
                "https://static.cdn-cdpl.com/source/b9a5514dc9fc5b70ff85311558a3cd27/C.png",
                "Bahasa C ini termasuk bahasa pemrograman tertua yang pernah ada. Pembuat bahasa C adalah Dennis Ritchie. Bahasa C menjadi bahasa pemrograman yang populer di Indonesia karena hampir sebagian besar perguruan tinggi jurusan IT ataupun lembaga kursus pemrograman menggunakan bahasa ini untuk dipelajari pertama kali sebelum mempelajari bahasa pemrograman yang lain"
        ));

        list.add(new AndroidPojo(
                R.drawable.java,
                "Java",
                "James Gosling",
                "1991",
                "https://static.cdn-cdpl.com/wp-images/2014/12/java_logo-350x215.jpg",
                "Bahasa pemrograman ini awalnya dikembangkan pada The Green Project pada tahun 1991 oleh Sun Microsystem yang kemudian dilepas pada Oracle. Nama Java sendiri dipilih karena salah seorang pendiri Java, James Gosling, sangat menyukai kopi murni yang langsung digiling dari mesin giling (kopi tubruk) dimana kopi jenis ini berasal dari pulau Jawa di Indonesia."
        ));

        list.add(new AndroidPojo(
                R.drawable.peh,
                "PHP",
                "Rasmus Lerdorf",
                "1995",
                "https://static.cdn-cdpl.com/wp-images/2014/12/PHP-350x184.png",
                "PHP (PHP Hypertext Pre-processor) merupakan bahasa pemrograman yang paling banyak digunakan di Indonesia. Selain karena gratis, PHP banyak digunakan karena bahasa pemrograman ini merupakan server side scripting yang memang dirancang untuk membangun website dinamis. Selain itu banyak website-website ternama seperti Facebook, Wordpress, ataupun Digg yang menggunakan PHP dalam pengembangannya.]"
        ));

        list.add(new AndroidPojo(
                R.drawable.vb_logo,
                "Visual Basic",
                "Microsoft",
                "1991",
                "http://4.bp.blogspot.com/-B6bK1oI8rM8/U3OUz6mF9EI/AAAAAAAADU0/6DsZXApQIn8/s1600/vb_logo.jpg",
                "Visual Basic merupakan bahasa pemrograman yang dikembangkan oleh Microsoft. Bahasa pemrograman ini menawarkan IDE visual dalam pembuatan software, dan bahasa pemrograman ini dikembangkan untuk membuat software-software berbasis sistem operasi Windows. VisualBasic sendiri adalah keturunan dari bahasa pemrograman BASIC"
        ));

        list.add(new AndroidPojo(
                R.drawable.python,
                "Python",
                "Guido Van Rossum",
                "1990",
                "https://static.cdn-cdpl.com/wp-images/2014/12/python-logo-master-v3-TM-350x118.png",
                "Python menjadi salah satu bahasa pemrograman yang dapat membangun aplikasi, baik itu berbasis web ataupun berbasis mobile. Bahasa phyton ini termasuk kedalam bahasa pemorgraman yang cukup mudah bagi pemula, karena bahasa tersebut mudah untuk dibaca dengan syntax yang mudah untuk dipahami juga. Banyak perusahaan besar menggunanakn Phyton dalam pengembanganya seperti Instagram, Pinterest dan Rdio. Python juga digunakan oleh para pengembang Google, Yahoo!, dan juga NASA."
        ));

        list.add(new AndroidPojo(
                R.drawable.ples,
                "c++",
                "Bjarne Stroustrup",
                "1980",
                "http://4.bp.blogspot.com/-xSVMVNudNEA/UmCQbc_ZwhI/AAAAAAAAAks/P5H0YWlQgnc/s1600/c-logo.jpg",
                "C++ dan C memiliki sintaks penulisan yang hampir sama, meski begitu kedua bahasa pemrograman ini memiliki perbedaan pada penyelesaian masalahnya. Pada bahasa C penyelesaian masalah dilakukan dengan membagi-bagi kedalam sub-sub masalah yang lebih kecil lagi atau bisa disebut bahasa pemrograman prosedural, sedangakan C++ berorientasi pada objek dimana permasalahan dibagi-bagi kedalam class-class."
        ));

        list.add(new AndroidPojo(
                R.drawable.js,
                "JavaScript",
                "Brenden Eich",
                "1994",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjdTSmDXTU1rQrfs9_yZ2LfQxOuh_gVczrm0WGclClxZaHdamx",
                "JavaScript adalah bahasa pemrograma yang dikembangkan oleh Netscape. Penggunaan JavaScript saat ini kebanyakan terdapat pada pengembangan web. Dengan JavaScript ini kita bisa membuat web yang interaktif dan menarik. Di Indonesia sendiri terdapat grup Facebook yang membahas tentang JavaScript ini dengan nama JavaScript Indonesia. Grup yang beranggotakan lebih dari 10 ribu orang ini masih aktif sampai sekarang"
        ));

        list.add(new AndroidPojo(
                R.drawable.sarp,
                "c#",
                "Microsoft",
                "2000",
                "https://static.cdn-cdpl.com/wp-images/2014/12/2p4i-150x150.png",
                "C# adalah bahasa pemrograman yang dikembangkan oleh Microsoft. C# ini menggabungkan prinsip dari C dan C++. C# ini banyak digunakan untuk mengembangkan software yang menggunakan platform Windows."
        ));

        list.add(new AndroidPojo(
                R.drawable.objective,
                "Objective-C",
                "Brad Cox dan Tom Cinta",
                "1980",
                "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSWoDh__Q85PAp95az3sd2AGln_2q1W7oPmwHc2Ea6I5oSECC3b",
                "Objective-C adalah bahasa pemrograman yang berorientasi objek. Bahasa pemrograman ini digunakan untuk pengembangan aplikasi yang digunakan pada perangkat Apple, bahkan sistem operasi iOS pun dikembangkan menggunakan bahasa pemrograman Objective-C ini"
        ));

        list.add(new AndroidPojo(
                R.drawable.kotlin,
                "Kotlin",
                "JetBrain",
                "2016",
                "https://upload.wikimedia.org/wikipedia/commons/b/b5/Kotlin-logo.png",
                "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.[2] Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.[3] Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android.[4] "
        ));


    }
}
