package demo.jordan.referencearchitecture

/**
 * Created by Jordan on 4/9/2016.
 */
class TestModel: ITestModel {
    override fun fakeServiceCall(): Array<String> {
        return arrayOf("Jordan", "Jen", "Levi", "Macie");
    }
}