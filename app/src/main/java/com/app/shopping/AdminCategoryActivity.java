package com.app.shopping;
//loại sản phẩm

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView cookingbook, techbook, textbook, Lawbook;
    private ImageView religiousbook, fashionbook, childrenbooks, medicinebook;
    private ImageView sciencebook, horrorbook, itbook, languagebook;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        cookingbook = (ImageView) findViewById(R.id.cookingbook);
        techbook = (ImageView) findViewById(R.id.techbook);
        textbook = (ImageView) findViewById(R.id.textbook);
        Lawbook = (ImageView) findViewById(R.id.Lawbook);

        religiousbook = (ImageView) findViewById(R.id.religiousbook);
        fashionbook = (ImageView) findViewById(R.id.fashionbook);
        childrenbooks = (ImageView) findViewById(R.id.childrenbooks);
        medicinebook = (ImageView) findViewById(R.id.medicinebook);

        sciencebook = (ImageView) findViewById(R.id.sciencebook);
        horrorbook = (ImageView) findViewById(R.id.horrorbook);
        itbook = (ImageView) findViewById(R.id.itbook);
        languagebook = (ImageView) findViewById(R.id.languagebook);


        cookingbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "cookingbook");
                startActivity(intent);
            }
        });
        techbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "techbook");
                startActivity(intent);
            }
        });


        textbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "textbook");
                startActivity(intent);
            }
        });


        Lawbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Lawbook");
                startActivity(intent);
            }
        });


        religiousbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "religiousbook");
                startActivity(intent);
            }
        });


        fashionbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "fashionbook");
                startActivity(intent);
            }
        });



        childrenbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "childrenbooks");
                startActivity(intent);
            }
        });


        medicinebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "medicinebook");
                startActivity(intent);
            }
        });



        sciencebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "sciencebook");
                startActivity(intent);
            }
        });


        horrorbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "horrorbook");
                startActivity(intent);
            }
        });


        itbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "itbook");
                startActivity(intent);
            }
        });


        languagebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "languagebook");
                startActivity(intent);
            }
        });
    }
}
