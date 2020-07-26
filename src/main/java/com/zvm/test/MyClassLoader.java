package com.zvm.test;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 9:37
 */
public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("D:\\javaEngineer\\myClassScope\\",name.replace(".","\\").concat(".class"));
        System.out.println(file.getPath());
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b = 0;

            while ((b = fis.read())!=-1){
                baos.write(b);
            }

            byte[] bytes = baos.toByteArray();
            System.out.println(bytes.length);
            String s = new String(bytes);
            System.out.println(s);
            baos.close();
            fis.close();
            return defineClass(name,bytes,0,bytes.length);
        }catch (Exception e){
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException,
            InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> aClass = myClassLoader.loadClass("com.zvm.test.MyClassTestClassLoader");
        System.out.println(aClass.getName());
        Method out = aClass.getMethod("out");
        out.invoke(aClass.newInstance());
    }
}
