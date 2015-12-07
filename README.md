# ViewPagerArrowIndicator
A simple viewpager indicator that uses arrows on left and right.

## How to add
ViewPagerArrowIndicator is published with [JitPack.io](https://jitpack.io).
To add this library to your project, add these lines to your build.gradle

```
repositories {
  maven { url "https://jitpack.io" }
}

dependencies {
  compile 'com.github.sembozdemir:ViewPagerArrowIndicator:1.0.0'
}
```


## How to use
#### It is so simple. Just wrap your viewpager with ViewPagerArrowIndicator

```
<com.sembozdemir.viewpagerarrowindicator.library.ViewPagerArrowIndicator
    android:id="@+id/viewPagerArrowIndicator"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
    <android.support.v4.view.ViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</com.sembozdemir.viewpagerarrowindicator.library.ViewPagerArrowIndicator>
```

#### And then bind it in your activity, fragment etc.

```
viewPager = (ViewPager) findViewById(R.id.viewPager);
viewPagerArrowIndicator = (ViewPagerArrowIndicator) findViewById(R.id.viewPagerArrowIndicator);
viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

viewPagerArrowIndicator.bind(viewPager);
```
You have to set adapter before binding because ViewPagerArrowIndicator has to know page count of viewpager.

#### You can also customize arrows if you want. Just set your image resources.

```
viewPagerArrowIndicator.setArrowIndicatorRes(R.drawable.custom_left_arrow, 
        R.drawable.custom_right_arrow);
```
