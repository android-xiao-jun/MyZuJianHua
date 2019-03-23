# MyZuJianHua
学习组件化开发demo

#通过修改gradle文件配置，实现model和library切换，通过接口实现方法调用，和数据传递
   
  ext {    
    android = [    
            compileSdkVersion: 28,    
            buildToolsVersion: "28.0.3",    
            minSdkVersion    : 19,    
            targetSdkVersion : 28,    
            versionCode      : 1,      
            versionName      : "1.0"     
      ]  
  //  修改false（true）         
      login =false    
      mine=false    
  }    
  
