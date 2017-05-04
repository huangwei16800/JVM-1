package classfile;

/**
 * Author: zhangxin
 * Time: 2017/5/2 0002.
 * Desc:
 */
public class ConstantInvokeDynamicInfo extends ConstantInfo {
    int bootstrapMethodAttrIndex;
    int nameAndTypeIndex;

    @Override
    void readInfo(ClassReader reader) {
        bootstrapMethodAttrIndex = reader.readUint16();
        nameAndTypeIndex = reader.readUint16();
    }
}