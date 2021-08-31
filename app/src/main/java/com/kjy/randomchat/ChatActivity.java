package com.kjy.randomchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<ChatData> chatList;
    private String name;
    private String src;

    private EditText editText_chat;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setContentView(R.layout.activity_chat);

        btn_send = findViewById(R.id.btn_send);
        editText_chat = findViewById(R.id.editText_chat);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = editText_chat.getText().toString();

                // null이 아니면 값 전송
                if(msg != null) {
                    ChatData chat = new ChatData();
                    chat.setSrc(src);
                    chat.setName(name);
                    chat.setMsg(msg);
                    // 하면 디비에 값 넣기 (연동법 모름)
                }
            }
        });

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        chatList = new ArrayList<>();

    }
}