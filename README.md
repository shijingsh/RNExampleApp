# RNExampleApp
to learn  https://github.com/Evai/RNExampleApp




### 更新内容
- 升级RN
- 解决link 时的坑
- 升级 dependencies
- 增加模拟数据
- 屏蔽一些报错内容

### 应用截图
<p align="left">
<img width=200 title="" src="https://github.com/mg365/RNExampleApp/blob/master/image/pic.png">
</p>
<p align="left">
<img width=200 title="" src="https://github.com/mg365/RNExampleApp/blob/master/image/pic1.png">
</p>
<p align="left">
<img width=200 title="" src="https://github.com/mg365/RNExampleApp/blob/master/image/pic2.png">
</p>
<p align="left">
<img width=200 title="" src="https://github.com/mg365/RNExampleApp/blob/master/image/pic3.png">
</p>
<p align="left">
<img width=200 title="" src="https://github.com/mg365/RNExampleApp/blob/master/image/pic4.png">
</p>

## 配置步骤
- 删除代理

```
yarn config delete proxy
npm config rm proxy
npm config rm https-proxy
```

- 安装

yarn 版本 v1.16.0
```
yarn install
```

-  运行
```
react-native run-android
```

- android studio 打开项目
手工修改报错
     *  错误: 程序包android.support.annotation不存在 
        报错的地方全部删除
     *  @Nullable 编译报错    
        全部删除
## License
MIT License [read](https://github.com/Evai/RNExampleApp/blob/master/LICENSE)