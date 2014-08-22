BananaKnife
===========

```java
public class MyActivity extends Activity {
    @InjectView(R.id.text_view) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        BananaKnife.inject(this);

        textView.setText("WHOA!");
    }
}
```
