/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/basic/multifile")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiFileJvmBasicCompletionTestGenerated extends AbstractMultiFileJvmBasicCompletionTest {
    public void testAllFilesPresentInMultifile() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/basic/multifile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("CallableReferenceNotImported")
    public void testCallableReferenceNotImported() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CallableReferenceNotImported/", this::doTest);
    }

    @TestMetadata("CallableReferenceNotImportedExtension")
    public void testCallableReferenceNotImportedExtension() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CallableReferenceNotImportedExtension/", this::doTest);
    }

    @TestMetadata("CallableReferenceNotImportedExtension2")
    public void testCallableReferenceNotImportedExtension2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CallableReferenceNotImportedExtension2/", this::doTest);
    }

    @TestMetadata("CallablesInExcludedPackage")
    public void testCallablesInExcludedPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CallablesInExcludedPackage/", this::doTest);
    }

    @TestMetadata("ClassInExcludedPackage")
    public void testClassInExcludedPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ClassInExcludedPackage/", this::doTest);
    }

    @TestMetadata("CompleteFunctionWithNoSpecifiedType")
    public void testCompleteFunctionWithNoSpecifiedType() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CompleteFunctionWithNoSpecifiedType/", this::doTest);
    }

    @TestMetadata("CompleteImportedFunction")
    public void testCompleteImportedFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CompleteImportedFunction/", this::doTest);
    }

    @TestMetadata("CompletionOnImportedFunction")
    public void testCompletionOnImportedFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/CompletionOnImportedFunction/", this::doTest);
    }

    @TestMetadata("DoNotCompleteWithConstraints")
    public void testDoNotCompleteWithConstraints() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/DoNotCompleteWithConstraints/", this::doTest);
    }

    @TestMetadata("EntriesOfNotImportedEnumFromKotlin")
    public void testEntriesOfNotImportedEnumFromKotlin() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/EntriesOfNotImportedEnumFromKotlin/", this::doTest);
    }

    @TestMetadata("EnumEntry")
    public void testEnumEntry() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/EnumEntry/", this::doTest);
    }

    @TestMetadata("ExactMatchPreferImported")
    public void testExactMatchPreferImported() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExactMatchPreferImported/", this::doTest);
    }

    @TestMetadata("ExcludedClass")
    public void testExcludedClass() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExcludedClass/", this::doTest);
    }

    @TestMetadata("ExcludedJavaClass")
    public void testExcludedJavaClass() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExcludedJavaClass/", this::doTest);
    }

    @TestMetadata("ExtensionFunction")
    public void testExtensionFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExtensionFunction/", this::doTest);
    }

    @TestMetadata("ExtensionFunctionOnImportedFunction")
    public void testExtensionFunctionOnImportedFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExtensionFunctionOnImportedFunction/", this::doTest);
    }

    @TestMetadata("ExtensionOnNullable")
    public void testExtensionOnNullable() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExtensionOnNullable/", this::doTest);
    }

    @TestMetadata("ExtensionsAndGetPrefix")
    public void testExtensionsAndGetPrefix() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExtensionsAndGetPrefix/", this::doTest);
    }

    @TestMetadata("ExtensionsForSmartCast")
    public void testExtensionsForSmartCast() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ExtensionsForSmartCast/", this::doTest);
    }

    @TestMetadata("FileRefInStringLiteral")
    public void testFileRefInStringLiteral() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/FileRefInStringLiteral/", this::doTest);
    }

    @TestMetadata("FileRefInStringLiteralNoPrefix")
    public void testFileRefInStringLiteralNoPrefix() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/FileRefInStringLiteralNoPrefix/", this::doTest);
    }

    @TestMetadata("GroovyClassNameCompletionFromDefaultPackage")
    public void testGroovyClassNameCompletionFromDefaultPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/GroovyClassNameCompletionFromDefaultPackage/", this::doTest);
    }

    @TestMetadata("GroovyClassNameCompletionFromNonDefaultPackage")
    public void testGroovyClassNameCompletionFromNonDefaultPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/GroovyClassNameCompletionFromNonDefaultPackage/", this::doTest);
    }

    @TestMetadata("HiddenDeclarations")
    public void testHiddenDeclarations() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/HiddenDeclarations/", this::doTest);
    }

    @TestMetadata("InImport")
    public void testInImport() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/InImport/", this::doTest);
    }

    @TestMetadata("InImportedFunctionLiteralParameter")
    public void testInImportedFunctionLiteralParameter() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/InImportedFunctionLiteralParameter/", this::doTest);
    }

    @TestMetadata("IncorrectGetters")
    public void testIncorrectGetters() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/IncorrectGetters/", this::doTest);
    }

    @TestMetadata("JavaCallableReference")
    public void testJavaCallableReference() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/JavaCallableReference/", this::doTest);
    }

    @TestMetadata("JavaInnerClasses")
    public void testJavaInnerClasses() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/JavaInnerClasses/", this::doTest);
    }

    @TestMetadata("KT12124")
    public void testKT12124() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/KT12124/", this::doTest);
    }

    @TestMetadata("KT9835")
    public void testKT9835() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/KT9835/", this::doTest);
    }

    @TestMetadata("MoreSpecificExtensionGeneric")
    public void testMoreSpecificExtensionGeneric() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/MoreSpecificExtensionGeneric/", this::doTest);
    }

    @TestMetadata("MoreSpecificExtensionInDifferentPackage")
    public void testMoreSpecificExtensionInDifferentPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/MoreSpecificExtensionInDifferentPackage/", this::doTest);
    }

    @TestMetadata("MoreSpecificExtensionIsPrivate")
    public void testMoreSpecificExtensionIsPrivate() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/MoreSpecificExtensionIsPrivate/", this::doTest);
    }

    @TestMetadata("NoAutoInsertionOfNotImported")
    public void testNoAutoInsertionOfNotImported() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NoAutoInsertionOfNotImported/", this::doTest);
    }

    @TestMetadata("NoExtForOuterFromNested")
    public void testNoExtForOuterFromNested() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NoExtForOuterFromNested/", this::doTest);
    }

    @TestMetadata("NoExtensionMethodDuplication")
    public void testNoExtensionMethodDuplication() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NoExtensionMethodDuplication/", this::doTest);
    }

    @TestMetadata("NoGenericFunDuplication")
    public void testNoGenericFunDuplication() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NoGenericFunDuplication/", this::doTest);
    }

    @TestMetadata("NotImportedExtensionForImplicitReceiver")
    public void testNotImportedExtensionForImplicitReceiver() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionForImplicitReceiver/", this::doTest);
    }

    @TestMetadata("NotImportedExtensionFunction")
    public void testNotImportedExtensionFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunction/", this::doTest);
    }

    @TestMetadata("NotImportedExtensionFunction2")
    public void testNotImportedExtensionFunction2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunction2/", this::doTest);
    }

    @TestMetadata("NotImportedExtensionFunction3")
    public void testNotImportedExtensionFunction3() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunction3/", this::doTest);
    }

    @TestMetadata("NotImportedExtensionFunctionAndAlias")
    public void testNotImportedExtensionFunctionAndAlias() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionFunctionAndAlias/", this::doTest);
    }

    @TestMetadata("NotImportedExtensionProperty")
    public void testNotImportedExtensionProperty() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedExtensionProperty/", this::doTest);
    }

    @TestMetadata("NotImportedFunction")
    public void testNotImportedFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedFunction/", this::doTest);
    }

    @TestMetadata("NotImportedInfixExtension")
    public void testNotImportedInfixExtension() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedInfixExtension/", this::doTest);
    }

    @TestMetadata("NotImportedJavaClass")
    public void testNotImportedJavaClass() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedJavaClass/", this::doTest);
    }

    @TestMetadata("NotImportedObject")
    public void testNotImportedObject() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedObject/", this::doTest);
    }

    @TestMetadata("NotImportedProperty")
    public void testNotImportedProperty() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/NotImportedProperty/", this::doTest);
    }

    @TestMetadata("ObjectInTypePosition")
    public void testObjectInTypePosition() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ObjectInTypePosition/", this::doTest);
    }

    @TestMetadata("ObjectMembers")
    public void testObjectMembers() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ObjectMembers/", this::doTest);
    }

    @TestMetadata("ParameterNameAndTypeForNotImportedAlias")
    public void testParameterNameAndTypeForNotImportedAlias() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ParameterNameAndTypeForNotImportedAlias/", this::doTest);
    }

    @TestMetadata("ParameterNameAndTypeNestedClasses")
    public void testParameterNameAndTypeNestedClasses() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/ParameterNameAndTypeNestedClasses/", this::doTest);
    }

    @TestMetadata("PreferMemberToExtension")
    public void testPreferMemberToExtension() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PreferMemberToExtension/", this::doTest);
    }

    @TestMetadata("PreferMemberToGlobal")
    public void testPreferMemberToGlobal() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PreferMemberToGlobal/", this::doTest);
    }

    @TestMetadata("PreferMoreSpecificExtension1")
    public void testPreferMoreSpecificExtension1() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PreferMoreSpecificExtension1/", this::doTest);
    }

    @TestMetadata("PreferMoreSpecificExtension2")
    public void testPreferMoreSpecificExtension2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PreferMoreSpecificExtension2/", this::doTest);
    }

    @TestMetadata("PreferMoreSpecificExtension3")
    public void testPreferMoreSpecificExtension3() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PreferMoreSpecificExtension3/", this::doTest);
    }

    @TestMetadata("PropertyKeysEmptyString")
    public void testPropertyKeysEmptyString() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PropertyKeysEmptyString/", this::doTest);
    }

    @TestMetadata("PropertyKeysNoPrefix")
    public void testPropertyKeysNoPrefix() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PropertyKeysNoPrefix/", this::doTest);
    }

    @TestMetadata("PropertyKeysWithPrefix")
    public void testPropertyKeysWithPrefix() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/PropertyKeysWithPrefix/", this::doTest);
    }

    @TestMetadata("StaticMembersOfNotImportedClassFromJava")
    public void testStaticMembersOfNotImportedClassFromJava() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassFromJava/", this::doTest);
    }

    @TestMetadata("StaticMembersOfNotImportedClassFromKotlin")
    public void testStaticMembersOfNotImportedClassFromKotlin() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassFromKotlin/", this::doTest);
    }

    @TestMetadata("StaticMembersOfNotImportedClassFromKotlinObject")
    public void testStaticMembersOfNotImportedClassFromKotlinObject() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassFromKotlinObject/", this::doTest);
    }

    @TestMetadata("StaticMembersOfNotImportedClassNameConflict")
    public void testStaticMembersOfNotImportedClassNameConflict() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/StaticMembersOfNotImportedClassNameConflict/", this::doTest);
    }

    @TestMetadata("SyntheticExtensionDeprecated")
    public void testSyntheticExtensionDeprecated() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/SyntheticExtensionDeprecated/", this::doTest);
    }

    @TestMetadata("SyntheticExtensionForGenericClass")
    public void testSyntheticExtensionForGenericClass() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/SyntheticExtensionForGenericClass/", this::doTest);
    }

    @TestMetadata("SyntheticExtensionNonVoidSetter")
    public void testSyntheticExtensionNonVoidSetter() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/SyntheticExtensionNonVoidSetter/", this::doTest);
    }

    @TestMetadata("TopLevelFunction")
    public void testTopLevelFunction() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/TopLevelFunction/", this::doTest);
    }

    @TestMetadata("TypeAliases")
    public void testTypeAliases() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/basic/multifile/TypeAliases/", this::doTest);
    }
}
