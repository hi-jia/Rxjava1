package chzy.org.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Observable<Integer> observable=Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                e.onNext(1);
//                e.onNext(2);
//                e.onNext(3);
//                e.onComplete();
//            }
//        });
//        Observer observer=new Observer() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//                Log.e(TAG,"onSubscribe");
//            }
//
//            @Override
//            public void onNext(Object value) {
//
//                Log.e(TAG,"value:--"+value);
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//                Log.e(TAG,"onComplete");
//            }
//        };
//        observable.subscribe(observer);


        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onComplete();
            }
        }) .subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

                Log.e(TAG,"onSubscribe");
            }

            @Override
            public void onNext(Integer value) {
                Log.e(TAG,"value:--"+value);
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG,"onError");
            }

            @Override
            public void onComplete() {
                Log.e(TAG,"onComplete");
            }
        });

    }
}
