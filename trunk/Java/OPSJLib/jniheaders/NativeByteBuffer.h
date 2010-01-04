/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class ops_jni_NativeByteBuffer */

#ifndef _Included_ops_jni_NativeByteBuffer
#define _Included_ops_jni_NativeByteBuffer
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    getPosition
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_ops_jni_NativeByteBuffer_getPosition
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    initialize
 * Signature: ([BI)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_initialize
  (JNIEnv *, jobject, jbyteArray, jint);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeByte
 * Signature: (B)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeByte
  (JNIEnv *, jobject, jbyte);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeInt
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeInt
  (JNIEnv *, jobject, jint);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeLong
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeLong
  (JNIEnv *, jobject, jlong);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeShort
 * Signature: (S)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeShort
  (JNIEnv *, jobject, jshort);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeFloat
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeFloat
  (JNIEnv *, jobject, jfloat);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeDouble
 * Signature: (D)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeDouble
  (JNIEnv *, jobject, jdouble);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeString
 * Signature: ([B)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeString
  (JNIEnv *, jobject, jbyteArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeBytes
 * Signature: ([B)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeBytes
  (JNIEnv *, jobject, jbyteArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeInts
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeInts
  (JNIEnv *, jobject, jintArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeLongs
 * Signature: ([J)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeLongs
  (JNIEnv *, jobject, jlongArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeShorts
 * Signature: ([S)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeShorts
  (JNIEnv *, jobject, jshortArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeFloats
 * Signature: ([F)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeFloats
  (JNIEnv *, jobject, jfloatArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    writeDoubles
 * Signature: ([D)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_writeDoubles
  (JNIEnv *, jobject, jdoubleArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readByte
 * Signature: ()B
 */
JNIEXPORT jbyte JNICALL Java_ops_jni_NativeByteBuffer_readByte
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readInt
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_ops_jni_NativeByteBuffer_readInt
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readShort
 * Signature: ()S
 */
JNIEXPORT jshort JNICALL Java_ops_jni_NativeByteBuffer_readShort
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readLong
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_ops_jni_NativeByteBuffer_readLong
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readFloat
 * Signature: ()F
 */
JNIEXPORT jfloat JNICALL Java_ops_jni_NativeByteBuffer_readFloat
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readDouble
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_ops_jni_NativeByteBuffer_readDouble
  (JNIEnv *, jobject);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readBytes
 * Signature: ([B)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readBytes
  (JNIEnv *, jobject, jbyteArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readInts
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readInts
  (JNIEnv *, jobject, jintArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readLongs
 * Signature: ([J)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readLongs
  (JNIEnv *, jobject, jlongArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readShorts
 * Signature: ([S)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readShorts
  (JNIEnv *, jobject, jshortArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readFloats
 * Signature: ([F)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readFloats
  (JNIEnv *, jobject, jfloatArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readDoubles
 * Signature: ([D)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readDoubles
  (JNIEnv *, jobject, jdoubleArray);

/*
 * Class:     ops_jni_NativeByteBuffer
 * Method:    readString
 * Signature: ([B)V
 */
JNIEXPORT void JNICALL Java_ops_jni_NativeByteBuffer_readString
  (JNIEnv *, jobject, jbyteArray);

#ifdef __cplusplus
}
#endif
#endif