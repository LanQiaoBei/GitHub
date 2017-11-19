#include <stdio.h>
#include <stdlib.h>
#define OK 1
#define ERROR 0

typedef struct TNode {
	int data; //数据域
	struct TNode *rchild,*lchild;  //指向左右孩子的指针
}TNode,*Tree;

int choice;
int count=0;
void CreateBianryTree(Tree *T) { //创建二叉树
	int a;
	printf("请输入二叉树结点的值:");
	scanf("%d",&a);
	if(a==00) *T=NULL;
	else {
		*T=(Tree)malloc(sizeof(TNode));
	if(!T)
	{
		printf("空间分配失败");
		exit(ERROR);
	}
	(*T)->data=a;
	CreateBianryTree(&((*T)->lchild)); //递归调用函数,构造左子树
	CreateBianryTree(&((*T)->rchild)); //递归调用函数,构造右子树
	}
}

void InitBinaryTree(Tree *T) {
	T=NULL;
}

void DestoryTree(Tree *T) {
	if(*T) {	
		
		DestoryTree(&((*T)->lchild));
		DestoryTree(&((*T)->rchild));
		free(T);
		T=NULL;
	
	}
}

void visit(int e) {
	printf("%d ",e);
}

void PreOrderTree(Tree *T,void(*visit)(int)) {
	if(*T) {
		visit((*T)->data);
		PreOrderTree(&(*T)->lchild,visit);
		PreOrderTree(&(*T)->rchild,visit);
		}
}

void InOrderTree(Tree *T,void(*visit)(int)) {
	if(*T) {
		InOrderTree(&(*T)->lchild,visit);
		visit((*T)->data);
		InOrderTree(&(*T)->rchild,visit);	
	}
}

void PostOrderTree(Tree *T,void(*visit)(int)) {
	if(*T) {
		PostOrderTree(&(*T)->lchild,visit);
		PostOrderTree(&(*T)->rchild,visit);
		visit((*T)->data);	
	}
}

int CountTreeLeaf(Tree *T) {
	if(*T) {
		CountTreeLeaf(&(*T)->lchild);
		CountTreeLeaf(&(*T)->rchild);
		if((*T)->lchild==NULL && (*T)->rchild==NULL)
			count++;
		return count;
	}
	else return 0;
}

int DepthTree(Tree *T) {
	int ldep,rdep;
	if(*T) {
		ldep=DepthTree(&(*T)->lchild);
		rdep=DepthTree(&(*T)->rchild);
		if(ldep>rdep) return (ldep+1);
		else return(rdep+1);
	}
	else return 0;
}

int CountTreeNode(Tree *T) {
	if(*T) {
		count++;
		CountTreeNode(&(*T)->lchild);
		CountTreeNode(&(*T)->rchild);
		return count;
	}
	else return 0;
}

void example() {
	printf("如果你想建立如图所示的二叉树\n");
	printf("\n");
	printf("                                 1                \n");
	printf("                               /  \\              \n");
	printf("                             3       3            \n");
	printf("                           /   \\      \\         \n");
	printf("                         4      5       7         \n");
	printf("\n");
	printf("请输入:1 3 4 00 00 5 00 00 3 00 7 00 00\n");
	printf("按先序遍历次序输入二叉树中结点的值(输入00表示结点为空)\n");
}

void main() {
	Tree T;
	int j=1;
	int x;
	system("color FC");
	example();
	while(j) {
	printf("\n\n\n");
	printf("\t\t* * * * * * * * * * 欢迎构建二叉树* * * * * * * * * * * *");
	printf("\t\t\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t1.创建二叉树\t\t2.先序遍历二叉树\t*\n");
	printf("\t\t*\t3.中序遍历二叉树\t4.后序遍历二叉树\t*\n");
	printf("\t\t*\t5.计算叶子结点的个数\t6.计算树的深度\t\t*\n");
	printf("\t\t*\t7.计算总结点个数\t\t\t\t*\n");
	printf("\t\t*\t0.退出\t\t\t\t\t\t*");
	printf("\t\t\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t\t\t\t\t\t\t*\t");
	printf("\t\t*\t\t遍历之前请先创建二叉树\t\t\t*\n");
	printf("\t\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t\t\t\t\t\t\t*\t");
	printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	printf("请输入你的选择:");
	scanf("%d",&choice);
	getchar();
		if(choice==1) {
	printf("请输入所要创建的二叉树:\n");
	CreateBianryTree(&T);
	InitBinaryTree(&T);
		}
		else if(choice==2) {
	printf("\n先序遍历二叉树:\n");
	PreOrderTree(&T,visit);	
	printf("\n");
		}
		else if(choice==3) {
	printf("\n中序遍历二叉树:\n");
	InOrderTree(&T,visit);
	printf("\n");
		}
		else if(choice==4) {
	printf("\n后序遍历二叉树:\n");
	PostOrderTree(&T,visit);
	printf("\n");
		}
		else if(choice==5) {
	count=CountTreeLeaf(&T);
	printf("\n二叉树的叶子结点数为:%d\n",count);
		}
		else if(choice==6) {
	x=DepthTree(&T);
	printf("\n二叉树的深度为:%d\n",x);
		}
		else if(choice==7) {
	count=CountTreeNode(&T);
	printf("\n二叉树总的结点个数为:%d\n",count);
		}
		else if(choice==0) {
			j=0;
			printf("\t\t\t 程序结束!\n");}
		else printf("\n 输入错误,请重新输入!\n");
	}
}