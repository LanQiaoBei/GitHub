#include <stdio.h>
#include <stdlib.h>
#define OK 1
#define ERROR 0

typedef struct TNode {
	int data; //������
	struct TNode *rchild,*lchild;  //ָ�����Һ��ӵ�ָ��
}TNode,*Tree;

int choice;
int count=0;
void CreateBianryTree(Tree *T) { //����������
	int a;
	printf("���������������ֵ:");
	scanf("%d",&a);
	if(a==00) *T=NULL;
	else {
		*T=(Tree)malloc(sizeof(TNode));
	if(!T)
	{
		printf("�ռ����ʧ��");
		exit(ERROR);
	}
	(*T)->data=a;
	CreateBianryTree(&((*T)->lchild)); //�ݹ���ú���,����������
	CreateBianryTree(&((*T)->rchild)); //�ݹ���ú���,����������
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
	printf("������뽨����ͼ��ʾ�Ķ�����\n");
	printf("\n");
	printf("                                 1                \n");
	printf("                               /  \\              \n");
	printf("                             3       3            \n");
	printf("                           /   \\      \\         \n");
	printf("                         4      5       7         \n");
	printf("\n");
	printf("������:1 3 4 00 00 5 00 00 3 00 7 00 00\n");
	printf("�����������������������н���ֵ(����00��ʾ���Ϊ��)\n");
}

void main() {
	Tree T;
	int j=1;
	int x;
	system("color FC");
	example();
	while(j) {
	printf("\n\n\n");
	printf("\t\t* * * * * * * * * * ��ӭ����������* * * * * * * * * * * *");
	printf("\t\t\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t1.����������\t\t2.�������������\t*\n");
	printf("\t\t*\t3.�������������\t4.�������������\t*\n");
	printf("\t\t*\t5.����Ҷ�ӽ��ĸ���\t6.�����������\t\t*\n");
	printf("\t\t*\t7.�����ܽ�����\t\t\t\t*\n");
	printf("\t\t*\t0.�˳�\t\t\t\t\t\t*");
	printf("\t\t\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t\t\t\t\t\t\t*\t");
	printf("\t\t*\t\t����֮ǰ���ȴ���������\t\t\t*\n");
	printf("\t\t*\t\t\t\t\t\t\t*\t\t");
	printf("\t*\t\t\t\t\t\t\t*\t");
	printf("\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	printf("���������ѡ��:");
	scanf("%d",&choice);
	getchar();
		if(choice==1) {
	printf("��������Ҫ�����Ķ�����:\n");
	CreateBianryTree(&T);
	InitBinaryTree(&T);
		}
		else if(choice==2) {
	printf("\n�������������:\n");
	PreOrderTree(&T,visit);	
	printf("\n");
		}
		else if(choice==3) {
	printf("\n�������������:\n");
	InOrderTree(&T,visit);
	printf("\n");
		}
		else if(choice==4) {
	printf("\n�������������:\n");
	PostOrderTree(&T,visit);
	printf("\n");
		}
		else if(choice==5) {
	count=CountTreeLeaf(&T);
	printf("\n��������Ҷ�ӽ����Ϊ:%d\n",count);
		}
		else if(choice==6) {
	x=DepthTree(&T);
	printf("\n�����������Ϊ:%d\n",x);
		}
		else if(choice==7) {
	count=CountTreeNode(&T);
	printf("\n�������ܵĽ�����Ϊ:%d\n",count);
		}
		else if(choice==0) {
			j=0;
			printf("\t\t\t �������!\n");}
		else printf("\n �������,����������!\n");
	}
}