package com.zsc.faceapi.factory;

import com.arcsoft.face.FaceEngine;
import com.arcsoft.face.FaceFeature;
import com.arcsoft.face.FaceSimilar;

/**
 * 人脸特征对比
 *
 * @author Monsters
 * @date 2022/4/14 9:13 下午
 */
public class FaceContrast {

    public float contrast(byte[] face1, byte[] face2, FaceEngine faceEngine) {
        //特征比对
        FaceFeature targetFaceFeature = new FaceFeature();
        targetFaceFeature.setFeatureData(face1);
        FaceFeature sourceFaceFeature = new FaceFeature();
        sourceFaceFeature.setFeatureData(face2);
        FaceSimilar faceSimilar = new FaceSimilar();
        int compareCode = faceEngine.compareFaceFeature(targetFaceFeature, sourceFaceFeature, faceSimilar);
        //返回相似度，0-1之间
        return faceSimilar.getScore();
    }
}