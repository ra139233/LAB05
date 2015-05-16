/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Professor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ProfessorImpl#getRegProfessor <em>Reg Professor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfessorImpl extends UsuarioImpl implements Professor {
	/**
	 * The default value of the '{@link #getRegProfessor() <em>Reg Professor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegProfessor()
	 * @generated
	 * @ordered
	 */
	protected static final int REG_PROFESSOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegProfessor() <em>Reg Professor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegProfessor()
	 * @generated
	 * @ordered
	 */
	protected int regProfessor = REG_PROFESSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROFESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegProfessor() {
		return regProfessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegProfessor(int newRegProfessor) {
		int oldRegProfessor = regProfessor;
		regProfessor = newRegProfessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROFESSOR__REG_PROFESSOR, oldRegProfessor, regProfessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__REG_PROFESSOR:
				return new Integer(getRegProfessor());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__REG_PROFESSOR:
				setRegProfessor(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__REG_PROFESSOR:
				setRegProfessor(REG_PROFESSOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PROFESSOR__REG_PROFESSOR:
				return regProfessor != REG_PROFESSOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (regProfessor: ");
		result.append(regProfessor);
		result.append(')');
		return result.toString();
	}

} //ProfessorImpl
