/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TerminalImpl
	 * @see Model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Terminal Ativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TERMINAL_ATIVO = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecaImpl
	 * @see Model.impl.ModelPackageImpl#getBiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 1;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExemplarImpl
	 * @see Model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 2;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__ID_EXEMPLAR = 0;

	/**
	 * The feature id for the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__DATA_ENTRADA = 1;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.UsuarioImpl
	 * @see Model.impl.ModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 3;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Instituto Faculdade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__INSTITUTO_FACULDADE = 1;

	/**
	 * The feature id for the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NUM_REGISTRO = 2;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__RG = 3;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 4;

	/**
	 * The feature id for the '<em><b>Tipo Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TIPO_USUARIO = 5;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AlunoImpl
	 * @see Model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 4;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto Faculdade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__INSTITUTO_FACULDADE = USUARIO__INSTITUTO_FACULDADE;

	/**
	 * The feature id for the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NUM_REGISTRO = USUARIO__NUM_REGISTRO;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__RG = USUARIO__RG;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Tipo Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TIPO_USUARIO = USUARIO__TIPO_USUARIO;

	/**
	 * The feature id for the '<em><b>Reg Aluno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__REG_ALUNO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ProfessorImpl
	 * @see Model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 5;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto Faculdade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUTO_FACULDADE = USUARIO__INSTITUTO_FACULDADE;

	/**
	 * The feature id for the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NUM_REGISTRO = USUARIO__NUM_REGISTRO;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__RG = USUARIO__RG;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Tipo Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TIPO_USUARIO = USUARIO__TIPO_USUARIO;

	/**
	 * The feature id for the '<em><b>Reg Professor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__REG_PROFESSOR = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecarioImpl <em>Bibliotecario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecarioImpl
	 * @see Model.impl.ModelPackageImpl#getBibliotecario()
	 * @generated
	 */
	int BIBLIOTECARIO = 6;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto Faculdade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__INSTITUTO_FACULDADE = USUARIO__INSTITUTO_FACULDADE;

	/**
	 * The feature id for the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__NUM_REGISTRO = USUARIO__NUM_REGISTRO;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__RG = USUARIO__RG;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Tipo Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__TIPO_USUARIO = USUARIO__TIPO_USUARIO;

	/**
	 * The feature id for the '<em><b>Id Funcionario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO__ID_FUNCIONARIO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bibliotecario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PublicacaoImpl
	 * @see Model.impl.ModelPackageImpl#getPublicacao()
	 * @generated
	 */
	int PUBLICACAO = 7;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__ID_EXEMPLAR = EXEMPLAR__ID_EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__DATA_ENTRADA = EXEMPLAR__DATA_ENTRADA;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__AUTOR = EXEMPLAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__DATA_PUBLICACAO = EXEMPLAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_FEATURE_COUNT = EXEMPLAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Model.impl.EmpréstimoImpl <em>Empréstimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EmpréstimoImpl
	 * @see Model.impl.ModelPackageImpl#getEmpréstimo()
	 * @generated
	 */
	int EMPRÉSTIMO = 8;

	/**
	 * The feature id for the '<em><b>Data Retirada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO__DATA_RETIRADA = 0;

	/**
	 * The feature id for the '<em><b>Data Devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO__DATA_DEVOLUCAO = 1;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO__ID_EXEMPLAR = 2;

	/**
	 * The feature id for the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO__NUM_REGISTRO = 3;

	/**
	 * The number of structural features of the '<em>Empréstimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.LivroImpl
	 * @see Model.impl.ModelPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 9;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__ID_EXEMPLAR = PUBLICACAO__ID_EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__DATA_ENTRADA = PUBLICACAO__DATA_ENTRADA;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__NOME = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EDITORA = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EDICAO = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__VOLUME = PUBLICACAO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Model.impl.PeriodicoImpl <em>Periodico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PeriodicoImpl
	 * @see Model.impl.ModelPackageImpl#getPeriodico()
	 * @generated
	 */
	int PERIODICO = 10;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__ID_EXEMPLAR = PUBLICACAO__ID_EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__DATA_ENTRADA = PUBLICACAO__DATA_ENTRADA;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__NOME = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__EDITOR = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Peridiocidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__PERIDIOCIDADE = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TeseImpl
	 * @see Model.impl.ModelPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 11;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__ID_EXEMPLAR = PUBLICACAO__ID_EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__DATA_ENTRADA = PUBLICACAO__DATA_ENTRADA;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__NOME = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assunto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__ASSUNTO = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Model.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ManualImpl
	 * @see Model.impl.ModelPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 12;

	/**
	 * The feature id for the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ID_EXEMPLAR = PUBLICACAO__ID_EXEMPLAR;

	/**
	 * The feature id for the '<em><b>Data Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__DATA_ENTRADA = PUBLICACAO__DATA_ENTRADA;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NOME = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tematica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TEMATICA = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Model.impl.AtendenteImpl <em>Atendente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AtendenteImpl
	 * @see Model.impl.ModelPackageImpl#getAtendente()
	 * @generated
	 */
	int ATENDENTE = 13;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto Faculdade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__INSTITUTO_FACULDADE = USUARIO__INSTITUTO_FACULDADE;

	/**
	 * The feature id for the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NUM_REGISTRO = USUARIO__NUM_REGISTRO;

	/**
	 * The feature id for the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__RG = USUARIO__RG;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Tipo Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TIPO_USUARIO = USUARIO__TIPO_USUARIO;

	/**
	 * The feature id for the '<em><b>Id Funcionario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__ID_FUNCIONARIO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link Model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see Model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link Model.Terminal#isTerminalAtivo <em>Terminal Ativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal Ativo</em>'.
	 * @see Model.Terminal#isTerminalAtivo()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_TerminalAtivo();

	/**
	 * Returns the meta object for class '{@link Model.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biblioteca</em>'.
	 * @see Model.Biblioteca
	 * @generated
	 */
	EClass getBiblioteca();

	/**
	 * Returns the meta object for class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getIdExemplar <em>Id Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Exemplar</em>'.
	 * @see Model.Exemplar#getIdExemplar()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_IdExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getDataEntrada <em>Data Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Entrada</em>'.
	 * @see Model.Exemplar#getDataEntrada()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_DataEntrada();

	/**
	 * Returns the meta object for class '{@link Model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see Model.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Usuario#getNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getInstituto_Faculdade <em>Instituto Faculdade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto Faculdade</em>'.
	 * @see Model.Usuario#getInstituto_Faculdade()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Instituto_Faculdade();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getNumRegistro <em>Num Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Registro</em>'.
	 * @see Model.Usuario#getNumRegistro()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_NumRegistro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getRg <em>Rg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rg</em>'.
	 * @see Model.Usuario#getRg()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Rg();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Model.Usuario#getCpf()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTipoUsuario <em>Tipo Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Usuario</em>'.
	 * @see Model.Usuario#getTipoUsuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_TipoUsuario();

	/**
	 * Returns the meta object for class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#getRegAluno <em>Reg Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Aluno</em>'.
	 * @see Model.Aluno#getRegAluno()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_RegAluno();

	/**
	 * Returns the meta object for class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Professor#getRegProfessor <em>Reg Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Professor</em>'.
	 * @see Model.Professor#getRegProfessor()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_RegProfessor();

	/**
	 * Returns the meta object for class '{@link Model.Bibliotecario <em>Bibliotecario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotecario</em>'.
	 * @see Model.Bibliotecario
	 * @generated
	 */
	EClass getBibliotecario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Bibliotecario#getIdFuncionario <em>Id Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Funcionario</em>'.
	 * @see Model.Bibliotecario#getIdFuncionario()
	 * @see #getBibliotecario()
	 * @generated
	 */
	EAttribute getBibliotecario_IdFuncionario();

	/**
	 * Returns the meta object for class '{@link Model.Publicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicacao</em>'.
	 * @see Model.Publicacao
	 * @generated
	 */
	EClass getPublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Model.Publicacao#getAutor()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getDataPublicacao <em>Data Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Publicacao</em>'.
	 * @see Model.Publicacao#getDataPublicacao()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_DataPublicacao();

	/**
	 * Returns the meta object for class '{@link Model.Empréstimo <em>Empréstimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empréstimo</em>'.
	 * @see Model.Empréstimo
	 * @generated
	 */
	EClass getEmpréstimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Empréstimo#getDataRetirada <em>Data Retirada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Retirada</em>'.
	 * @see Model.Empréstimo#getDataRetirada()
	 * @see #getEmpréstimo()
	 * @generated
	 */
	EAttribute getEmpréstimo_DataRetirada();

	/**
	 * Returns the meta object for the attribute '{@link Model.Empréstimo#getDataDevolucao <em>Data Devolucao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Devolucao</em>'.
	 * @see Model.Empréstimo#getDataDevolucao()
	 * @see #getEmpréstimo()
	 * @generated
	 */
	EAttribute getEmpréstimo_DataDevolucao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Empréstimo#getIdExemplar <em>Id Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Exemplar</em>'.
	 * @see Model.Empréstimo#getIdExemplar()
	 * @see #getEmpréstimo()
	 * @generated
	 */
	EAttribute getEmpréstimo_IdExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Empréstimo#getNumRegistro <em>Num Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Registro</em>'.
	 * @see Model.Empréstimo#getNumRegistro()
	 * @see #getEmpréstimo()
	 * @generated
	 */
	EAttribute getEmpréstimo_NumRegistro();

	/**
	 * Returns the meta object for class '{@link Model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see Model.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Livro#getNome()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getEditora <em>Editora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editora</em>'.
	 * @see Model.Livro#getEditora()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Editora();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getEdicao <em>Edicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edicao</em>'.
	 * @see Model.Livro#getEdicao()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Edicao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see Model.Livro#getVolume()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Volume();

	/**
	 * Returns the meta object for class '{@link Model.Periodico <em>Periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodico</em>'.
	 * @see Model.Periodico
	 * @generated
	 */
	EClass getPeriodico();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Periodico#getNome()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor</em>'.
	 * @see Model.Periodico#getEditor()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Editor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getPeridiocidade <em>Peridiocidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peridiocidade</em>'.
	 * @see Model.Periodico#getPeridiocidade()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Peridiocidade();

	/**
	 * Returns the meta object for class '{@link Model.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tese</em>'.
	 * @see Model.Tese
	 * @generated
	 */
	EClass getTese();

	/**
	 * Returns the meta object for the attribute '{@link Model.Tese#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Tese#getNome()
	 * @see #getTese()
	 * @generated
	 */
	EAttribute getTese_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Tese#getAssunto <em>Assunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assunto</em>'.
	 * @see Model.Tese#getAssunto()
	 * @see #getTese()
	 * @generated
	 */
	EAttribute getTese_Assunto();

	/**
	 * Returns the meta object for class '{@link Model.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see Model.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for the attribute '{@link Model.Manual#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Manual#getNome()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Manual#getTematica <em>Tematica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tematica</em>'.
	 * @see Model.Manual#getTematica()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_Tematica();

	/**
	 * Returns the meta object for class '{@link Model.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atendente</em>'.
	 * @see Model.Atendente
	 * @generated
	 */
	EClass getAtendente();

	/**
	 * Returns the meta object for the attribute '{@link Model.Atendente#getIdFuncionario <em>Id Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Funcionario</em>'.
	 * @see Model.Atendente#getIdFuncionario()
	 * @see #getAtendente()
	 * @generated
	 */
	EAttribute getAtendente_IdFuncionario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TerminalImpl
		 * @see Model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Terminal Ativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__TERMINAL_ATIVO = eINSTANCE.getTerminal_TerminalAtivo();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecaImpl
		 * @see Model.impl.ModelPackageImpl#getBiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getBiblioteca();

		/**
		 * The meta object literal for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExemplarImpl
		 * @see Model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Id Exemplar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__ID_EXEMPLAR = eINSTANCE.getExemplar_IdExemplar();

		/**
		 * The meta object literal for the '<em><b>Data Entrada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__DATA_ENTRADA = eINSTANCE.getExemplar_DataEntrada();

		/**
		 * The meta object literal for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.UsuarioImpl
		 * @see Model.impl.ModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOME = eINSTANCE.getUsuario_Nome();

		/**
		 * The meta object literal for the '<em><b>Instituto Faculdade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__INSTITUTO_FACULDADE = eINSTANCE.getUsuario_Instituto_Faculdade();

		/**
		 * The meta object literal for the '<em><b>Num Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NUM_REGISTRO = eINSTANCE.getUsuario_NumRegistro();

		/**
		 * The meta object literal for the '<em><b>Rg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__RG = eINSTANCE.getUsuario_Rg();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getUsuario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Tipo Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TIPO_USUARIO = eINSTANCE.getUsuario_TipoUsuario();

		/**
		 * The meta object literal for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AlunoImpl
		 * @see Model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '<em><b>Reg Aluno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__REG_ALUNO = eINSTANCE.getAluno_RegAluno();

		/**
		 * The meta object literal for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ProfessorImpl
		 * @see Model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Reg Professor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__REG_PROFESSOR = eINSTANCE.getProfessor_RegProfessor();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecarioImpl <em>Bibliotecario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecarioImpl
		 * @see Model.impl.ModelPackageImpl#getBibliotecario()
		 * @generated
		 */
		EClass BIBLIOTECARIO = eINSTANCE.getBibliotecario();

		/**
		 * The meta object literal for the '<em><b>Id Funcionario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECARIO__ID_FUNCIONARIO = eINSTANCE.getBibliotecario_IdFuncionario();

		/**
		 * The meta object literal for the '{@link Model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PublicacaoImpl
		 * @see Model.impl.ModelPackageImpl#getPublicacao()
		 * @generated
		 */
		EClass PUBLICACAO = eINSTANCE.getPublicacao();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__AUTOR = eINSTANCE.getPublicacao_Autor();

		/**
		 * The meta object literal for the '<em><b>Data Publicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__DATA_PUBLICACAO = eINSTANCE.getPublicacao_DataPublicacao();

		/**
		 * The meta object literal for the '{@link Model.impl.EmpréstimoImpl <em>Empréstimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EmpréstimoImpl
		 * @see Model.impl.ModelPackageImpl#getEmpréstimo()
		 * @generated
		 */
		EClass EMPRÉSTIMO = eINSTANCE.getEmpréstimo();

		/**
		 * The meta object literal for the '<em><b>Data Retirada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRÉSTIMO__DATA_RETIRADA = eINSTANCE.getEmpréstimo_DataRetirada();

		/**
		 * The meta object literal for the '<em><b>Data Devolucao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRÉSTIMO__DATA_DEVOLUCAO = eINSTANCE.getEmpréstimo_DataDevolucao();

		/**
		 * The meta object literal for the '<em><b>Id Exemplar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRÉSTIMO__ID_EXEMPLAR = eINSTANCE.getEmpréstimo_IdExemplar();

		/**
		 * The meta object literal for the '<em><b>Num Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRÉSTIMO__NUM_REGISTRO = eINSTANCE.getEmpréstimo_NumRegistro();

		/**
		 * The meta object literal for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.LivroImpl
		 * @see Model.impl.ModelPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__NOME = eINSTANCE.getLivro_Nome();

		/**
		 * The meta object literal for the '<em><b>Editora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__EDITORA = eINSTANCE.getLivro_Editora();

		/**
		 * The meta object literal for the '<em><b>Edicao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__EDICAO = eINSTANCE.getLivro_Edicao();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__VOLUME = eINSTANCE.getLivro_Volume();

		/**
		 * The meta object literal for the '{@link Model.impl.PeriodicoImpl <em>Periodico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PeriodicoImpl
		 * @see Model.impl.ModelPackageImpl#getPeriodico()
		 * @generated
		 */
		EClass PERIODICO = eINSTANCE.getPeriodico();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__NOME = eINSTANCE.getPeriodico_Nome();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__EDITOR = eINSTANCE.getPeriodico_Editor();

		/**
		 * The meta object literal for the '<em><b>Peridiocidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__PERIDIOCIDADE = eINSTANCE.getPeriodico_Peridiocidade();

		/**
		 * The meta object literal for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TeseImpl
		 * @see Model.impl.ModelPackageImpl#getTese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.getTese();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESE__NOME = eINSTANCE.getTese_Nome();

		/**
		 * The meta object literal for the '<em><b>Assunto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESE__ASSUNTO = eINSTANCE.getTese_Assunto();

		/**
		 * The meta object literal for the '{@link Model.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ManualImpl
		 * @see Model.impl.ModelPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__NOME = eINSTANCE.getManual_Nome();

		/**
		 * The meta object literal for the '<em><b>Tematica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__TEMATICA = eINSTANCE.getManual_Tematica();

		/**
		 * The meta object literal for the '{@link Model.impl.AtendenteImpl <em>Atendente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AtendenteImpl
		 * @see Model.impl.ModelPackageImpl#getAtendente()
		 * @generated
		 */
		EClass ATENDENTE = eINSTANCE.getAtendente();

		/**
		 * The meta object literal for the '<em><b>Id Funcionario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATENDENTE__ID_FUNCIONARIO = eINSTANCE.getAtendente_IdFuncionario();

	}

} //ModelPackage
